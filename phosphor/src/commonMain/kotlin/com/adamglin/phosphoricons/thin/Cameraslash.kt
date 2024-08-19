package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Cameraslash: ImageVector
    get() {
        if (_cameraslash != null) {
            return _cameraslash!!
        }
        _cameraslash = Builder(name = "Cameraslash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f)
                lineTo(60.78f, 60.0f)
                lineTo(48.0f, 60.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 80.0f)
                lineTo(28.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(199.0f, 212.0f)
                lineToRelative(6.08f, 6.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(148.58f, 156.54f)
                arcTo(31.69f, 31.69f, 0.0f, false, true, 128.0f, 164.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -22.48f, -54.78f)
                close()
                moveTo(48.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(36.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 48.0f, 68.0f)
                horizontalLineToRelative(20.0f)
                lineToRelative(32.09f, 35.3f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 53.79f, 59.16f)
                lineTo(191.69f, 204.0f)
                close()
                moveTo(228.0f, 80.0f)
                lineTo(228.0f, 186.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(220.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(176.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.32f, -1.78f)
                lineTo(157.85f, 44.0f)
                lineTo(98.13f, 44.0f)
                lineToRelative(-0.82f, 1.23f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.65f, -4.44f)
                lineToRelative(2.0f, -3.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 96.0f, 36.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.33f, 1.78f)
                lineTo(178.13f, 60.0f)
                lineTo(208.0f, 60.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 228.0f, 80.0f)
                close()
            }
        }
        .build()
        return _cameraslash!!
    }

private var _cameraslash: ImageVector? = null
