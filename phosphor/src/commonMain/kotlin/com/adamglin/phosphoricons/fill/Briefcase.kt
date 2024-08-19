package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Briefcase: ImageVector
    get() {
        if (_briefcase != null) {
            return _briefcase!!
        }
        _briefcase = Builder(name = "Briefcase", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(112.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 112.0f)
                close()
                moveTo(232.0f, 72.0f)
                lineTo(232.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 56.0f)
                lineTo(80.0f, 56.0f)
                lineTo(80.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, -24.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 72.0f)
                close()
                moveTo(96.0f, 56.0f)
                horizontalLineToRelative(64.0f)
                lineTo(160.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(104.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                close()
                moveTo(216.0f, 113.61f)
                lineTo(216.0f, 72.0f)
                lineTo(40.0f, 72.0f)
                verticalLineToRelative(41.61f)
                arcTo(184.0f, 184.0f, 0.0f, false, false, 128.0f, 136.0f)
                arcTo(184.0f, 184.0f, 0.0f, false, false, 216.0f, 113.61f)
                close()
            }
        }
        .build()
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
