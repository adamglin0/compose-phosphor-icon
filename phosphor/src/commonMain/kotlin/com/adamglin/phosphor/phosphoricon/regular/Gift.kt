package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 72.0f)
                lineTo(180.92f, 72.0f)
                curveToRelative(0.39f, -0.33f, 0.79f, -0.65f, 1.17f, -1.0f)
                arcTo(29.53f, 29.53f, 0.0f, false, false, 192.0f, 49.57f)
                arcTo(32.62f, 32.62f, 0.0f, false, false, 158.44f, 16.0f)
                arcTo(29.53f, 29.53f, 0.0f, false, false, 137.0f, 25.91f)
                arcToRelative(54.94f, 54.94f, 0.0f, false, false, -9.0f, 14.48f)
                arcToRelative(54.94f, 54.94f, 0.0f, false, false, -9.0f, -14.48f)
                arcTo(29.53f, 29.53f, 0.0f, false, false, 97.56f, 16.0f)
                arcTo(32.62f, 32.62f, 0.0f, false, false, 64.0f, 49.57f)
                arcTo(29.53f, 29.53f, 0.0f, false, false, 73.91f, 71.0f)
                curveToRelative(0.38f, 0.33f, 0.78f, 0.65f, 1.17f, 1.0f)
                lineTo(40.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 88.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 88.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 72.0f)
                close()
                moveTo(149.0f, 36.51f)
                arcToRelative(13.69f, 13.69f, 0.0f, false, true, 10.0f, -4.5f)
                horizontalLineToRelative(0.49f)
                arcTo(16.62f, 16.62f, 0.0f, false, true, 176.0f, 49.08f)
                arcToRelative(13.69f, 13.69f, 0.0f, false, true, -4.5f, 10.0f)
                curveToRelative(-9.49f, 8.4f, -25.24f, 11.36f, -35.0f, 12.4f)
                curveTo(137.7f, 60.89f, 141.0f, 45.5f, 149.0f, 36.51f)
                close()
                moveTo(84.91f, 36.87f)
                arcTo(16.63f, 16.63f, 0.0f, false, true, 96.59f, 32.0f)
                horizontalLineToRelative(0.49f)
                arcToRelative(13.69f, 13.69f, 0.0f, false, true, 10.0f, 4.5f)
                curveToRelative(8.39f, 9.48f, 11.35f, 25.2f, 12.39f, 34.92f)
                curveToRelative(-9.72f, -1.0f, -25.44f, -4.0f, -34.92f, -12.39f)
                arcToRelative(13.69f, 13.69f, 0.0f, false, true, -4.5f, -10.0f)
                arcTo(16.6f, 16.6f, 0.0f, false, true, 84.87f, 36.87f)
                close()
                moveTo(40.0f, 88.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(32.0f)
                lineTo(40.0f, 120.0f)
                close()
                moveTo(56.0f, 136.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(64.0f)
                lineTo(56.0f, 200.0f)
                close()
                moveTo(200.0f, 200.0f)
                lineTo(136.0f, 200.0f)
                lineTo(136.0f, 136.0f)
                horizontalLineToRelative(64.0f)
                close()
                moveTo(216.0f, 120.0f)
                lineTo(136.0f, 120.0f)
                lineTo(136.0f, 88.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
