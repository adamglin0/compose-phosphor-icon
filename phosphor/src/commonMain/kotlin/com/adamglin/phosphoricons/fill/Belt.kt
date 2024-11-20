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

public val FillGroup.Belt: ImageVector
    get() {
        if (_belt != null) {
            return _belt!!
        }
        _belt = Builder(name = "Belt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(8.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(0.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(48.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(256.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(189.83f, 176.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 176.0f, 184.0f)
                lineTo(112.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -13.83f, -8.0f)
                lineTo(84.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(80.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(98.17f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 112.0f, 72.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 13.83f, 8.0f)
                lineTo(248.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 256.0f, 88.0f)
                close()
                moveTo(176.0f, 167.8f)
                lineTo(176.0f, 136.0f)
                lineTo(144.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                lineTo(176.0f, 88.0f)
                lineTo(112.0f, 88.0f)
                verticalLineToRelative(80.0f)
                horizontalLineToRelative(64.0f)
                curveTo(176.0f, 167.93f, 176.0f, 167.87f, 176.0f, 167.8f)
                close()
            }
        }
        .build()
        return _belt!!
    }

private var _belt: ImageVector? = null
