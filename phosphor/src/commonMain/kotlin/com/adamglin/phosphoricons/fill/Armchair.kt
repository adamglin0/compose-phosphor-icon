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

public val FillGroup.Armchair: ImageVector
    get() {
        if (_armchair != null) {
            return _armchair!!
        }
        _armchair = Builder(name = "Armchair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 132.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -24.0f, 27.71f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(159.71f)
                arcTo(28.0f, 28.0f, 0.0f, true, true, 72.0f, 132.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(144.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(132.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                close()
                moveTo(44.0f, 88.0f)
                arcToRelative(44.06f, 44.06f, 0.0f, false, true, 43.81f, 40.0f)
                horizontalLineToRelative(80.38f)
                arcTo(44.06f, 44.06f, 0.0f, false, true, 212.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(72.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, -40.0f)
                horizontalLineTo(80.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 40.0f, 72.0f)
                verticalLineTo(84.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 44.0f, 88.0f)
                close()
            }
        }
        .build()
        return _armchair!!
    }

private var _armchair: ImageVector? = null
