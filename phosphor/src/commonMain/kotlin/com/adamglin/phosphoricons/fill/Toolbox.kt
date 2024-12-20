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

public val FillGroup.Toolbox: ImageVector
    get() {
        if (_toolbox != null) {
            return _toolbox!!
        }
        _toolbox = Builder(name = "Toolbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 64.0f)
                lineTo(176.0f, 64.0f)
                lineTo(176.0f, 56.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                lineTo(104.0f, 32.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 80.0f, 56.0f)
                verticalLineToRelative(8.0f)
                lineTo(32.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 80.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(64.0f, 112.0f)
                lineTo(64.0f, 96.27f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 71.47f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 80.0f, 96.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(96.0f)
                lineTo(176.0f, 96.27f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 183.47f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 192.0f, 96.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(240.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 64.0f)
                close()
                moveTo(160.0f, 64.0f)
                lineTo(96.0f, 64.0f)
                lineTo(96.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
                moveTo(240.0f, 132.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(16.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(64.0f, 128.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, 8.0f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 80.0f, 143.73f)
                lineTo(80.0f, 128.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, 8.0f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, 7.47f, -8.25f)
                lineTo(192.0f, 128.0f)
                horizontalLineToRelative(44.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 240.0f, 132.0f)
                close()
            }
        }
        .build()
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
