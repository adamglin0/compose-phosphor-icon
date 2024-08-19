package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Filepdf: ImageVector
    get() {
        if (_filepdf != null) {
            return _filepdf!!
        }
        _filepdf = Builder(name = "Filepdf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(190.0f, 158.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(190.0f, 190.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(178.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 152.0f)
                close()
                moveTo(90.0f, 172.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, 26.0f)
                lineTo(54.0f, 198.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(42.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(64.0f, 146.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 90.0f, 172.0f)
                close()
                moveTo(78.0f, 172.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(54.0f, 158.0f)
                verticalLineToRelative(28.0f)
                lineTo(64.0f, 186.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 78.0f, 172.0f)
                close()
                moveTo(162.0f, 180.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -34.0f, 34.0f)
                lineTo(112.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(106.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(16.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 162.0f, 180.0f)
                close()
                moveTo(150.0f, 180.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, -22.0f)
                lineTo(118.0f, 158.0f)
                verticalLineToRelative(44.0f)
                horizontalLineToRelative(10.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 150.0f, 180.0f)
                close()
                moveTo(42.0f, 112.0f)
                lineTo(42.0f, 40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 56.0f, 26.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.25f, 1.76f)
                lineToRelative(56.0f, 56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 214.0f, 88.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(202.0f, 94.0f)
                lineTo(152.0f, 94.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(146.0f, 38.0f)
                lineTo(56.0f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(158.0f, 82.0f)
                horizontalLineToRelative(35.52f)
                lineTo(158.0f, 46.48f)
                close()
            }
        }
        .build()
        return _filepdf!!
    }

private var _filepdf: ImageVector? = null
