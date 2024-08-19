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

public val LightGroup.Personsimplewalk: ImageVector
    get() {
        if (_personsimplewalk != null) {
            return _personsimplewalk!!
        }
        _personsimplewalk = Builder(name = "Personsimplewalk", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(214.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                curveToRelative(-34.48f, 0.0f, -51.06f, -16.75f, -65.7f, -31.52f)
                curveToRelative(-3.47f, -3.51f, -6.75f, -6.82f, -10.15f, -9.78f)
                lineTo(117.0f, 143.61f)
                lineToRelative(38.52f, 27.51f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 158.0f, 176.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(146.0f, 179.09f)
                lineToRelative(-33.92f, -24.23f)
                lineTo(77.5f, 234.39f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.0f, -4.78f)
                lineToRelative(55.0f, -126.61f)
                curveToRelative(-10.18f, -2.75f, -23.07f, 0.0f, -38.51f, 8.29f)
                arcToRelative(165.76f, 165.76f, 0.0f, false, false, -30.92f, 22.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.22f, -8.74f)
                arcToRelative(175.4f, 175.4f, 0.0f, false, true, 33.27f, -23.77f)
                curveToRelative(25.93f, -14.0f, 47.64f, -14.39f, 62.77f, -1.26f)
                curveToRelative(3.77f, 3.27f, 7.4f, 6.93f, 10.9f, 10.47f)
                curveToRelative(13.62f, 13.75f, 27.69f, 28.0f, 57.17f, 28.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 214.0f, 144.0f)
                close()
            }
        }
        .build()
        return _personsimplewalk!!
    }

private var _personsimplewalk: ImageVector? = null
