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

public val RegularGroup.Dog: ImageVector
    get() {
        if (_dog != null) {
            return _dog!!
        }
        _dog = Builder(name = "Dog", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.71f, 125.0f)
                lineToRelative(-16.42f, -88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -19.61f, -12.58f)
                lineToRelative(-0.31f, 0.09f)
                lineTo(150.85f, 40.0f)
                horizontalLineToRelative(-45.7f)
                lineTo(52.63f, 24.56f)
                lineToRelative(-0.31f, -0.09f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.71f, 37.05f)
                lineTo(16.29f, 125.0f)
                arcToRelative(15.77f, 15.77f, 0.0f, false, false, 9.12f, 17.52f)
                arcTo(16.26f, 16.26f, 0.0f, false, false, 32.12f, 144.0f)
                arcTo(15.48f, 15.48f, 0.0f, false, false, 40.0f, 141.84f)
                lineTo(40.0f, 184.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, -40.0f)
                lineTo(216.0f, 141.85f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, false, 7.87f, 2.16f)
                arcToRelative(16.31f, 16.31f, 0.0f, false, false, 6.72f, -1.47f)
                arcTo(15.77f, 15.77f, 0.0f, false, false, 239.71f, 125.0f)
                close()
                moveTo(32.0f, 128.0f)
                horizontalLineToRelative(0.0f)
                lineTo(48.43f, 40.0f)
                lineTo(90.5f, 52.37f)
                close()
                moveTo(176.0f, 208.0f)
                lineTo(136.0f, 208.0f)
                lineTo(136.0f, 195.31f)
                lineToRelative(13.66f, -13.65f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineTo(128.0f, 180.69f)
                lineToRelative(-10.34f, -10.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineTo(120.0f, 195.31f)
                lineTo(120.0f, 208.0f)
                lineTo(80.0f, 208.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                lineTo(56.0f, 123.11f)
                lineTo(107.92f, 56.0f)
                horizontalLineToRelative(40.15f)
                lineTo(200.0f, 123.11f)
                lineTo(200.0f, 184.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 176.0f, 208.0f)
                close()
                moveTo(224.0f, 128.0f)
                lineTo(165.5f, 52.37f)
                lineTo(207.57f, 40.0f)
                lineTo(224.0f, 128.0f)
                close()
                moveTo(104.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 140.0f)
                close()
                moveTo(176.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 140.0f)
                close()
            }
        }
        .build()
        return _dog!!
    }

private var _dog: ImageVector? = null
