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

public val LightGroup.PersonSimpleHike: ImageVector
    get() {
        if (_personSimpleHike != null) {
            return _personSimpleHike!!
        }
        _personSimpleHike = Builder(name = "PersonSimpleHike", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 78.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -30.0f, -30.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 152.0f, 78.0f)
                close()
                moveTo(152.0f, 30.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 152.0f, 30.0f)
                close()
                moveTo(198.0f, 144.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(186.0f, 149.81f)
                curveToRelative(-26.23f, -1.73f, -34.76f, -14.89f, -42.35f, -26.59f)
                curveToRelative(-3.43f, -5.3f, -6.68f, -10.31f, -11.5f, -14.52f)
                lineTo(117.0f, 143.61f)
                lineToRelative(38.52f, 27.51f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 158.0f, 176.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(146.0f, 179.09f)
                lineToRelative(-33.92f, -24.23f)
                lineTo(77.5f, 234.39f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.0f, -4.78f)
                lineTo(124.0f, 97.29f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.25f, -2.94f)
                arcToRelative(38.89f, 38.89f, 0.0f, false, true, 7.65f, 5.21f)
                curveToRelative(6.15f, 5.34f, 10.0f, 11.33f, 13.79f, 17.13f)
                curveTo(161.44f, 128.59f, 167.54f, 138.0f, 192.0f, 138.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 198.0f, 144.0f)
                close()
                moveTo(72.0f, 150.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.52f, -3.64f)
                lineToRelative(24.0f, -56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.16f, -7.88f)
                lineToRelative(-28.0f, -12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.87f, 3.16f)
                lineToRelative(-24.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.15f, 7.87f)
                lineToRelative(28.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 72.0f, 150.0f)
                close()
                moveTo(51.88f, 128.85f)
                lineToRelative(19.27f, -45.0f)
                lineToRelative(17.0f, 7.27f)
                lineToRelative(-19.27f, 45.0f)
                close()
            }
        }
        .build()
        return _personSimpleHike!!
    }

private var _personSimpleHike: ImageVector? = null
