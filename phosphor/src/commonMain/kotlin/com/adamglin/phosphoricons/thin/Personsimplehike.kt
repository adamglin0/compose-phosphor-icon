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

public val ThinGroup.Personsimplehike: ImageVector
    get() {
        if (_personsimplehike != null) {
            return _personsimplehike!!
        }
        _personsimplehike = Builder(name = "Personsimplehike", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 76.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 152.0f, 76.0f)
                close()
                moveTo(152.0f, 28.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 152.0f, 28.0f)
                close()
                moveTo(196.0f, 144.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(188.0f, 147.92f)
                curveToRelative(-26.68f, -1.13f, -34.8f, -13.66f, -42.67f, -25.79f)
                curveToRelative(-3.53f, -5.46f, -6.87f, -10.61f, -12.0f, -15.0f)
                curveToRelative(-0.66f, -0.56f, -1.33f, -1.1f, -2.0f, -1.6f)
                lineTo(114.5f, 144.29f)
                lineToRelative(39.83f, 28.45f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 156.0f, 176.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(148.0f, 178.06f)
                lineTo(111.23f, 151.8f)
                lineTo(75.67f, 233.59f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 72.0f, 236.0f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, true, -1.59f, -0.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.08f, -5.27f)
                lineTo(125.86f, 98.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.5f, -2.0f)
                arcToRelative(37.24f, 37.24f, 0.0f, false, true, 7.26f, 4.94f)
                curveToRelative(5.94f, 5.15f, 9.74f, 11.0f, 13.42f, 16.71f)
                curveTo(159.77f, 129.7f, 166.45f, 140.0f, 192.0f, 140.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 196.0f, 144.0f)
                close()
                moveTo(72.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.68f, -2.43f)
                lineToRelative(24.0f, -56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.1f, -5.25f)
                lineToRelative(-28.0f, -12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.26f, 2.1f)
                lineToRelative(-24.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.11f, 5.26f)
                lineToRelative(28.0f, 12.0f)
                arcTo(3.94f, 3.94f, 0.0f, false, false, 72.0f, 148.0f)
                close()
                moveTo(49.25f, 129.9f)
                lineTo(70.1f, 81.25f)
                lineTo(90.75f, 90.1f)
                lineTo(69.9f, 138.75f)
                close()
            }
        }
        .build()
        return _personsimplehike!!
    }

private var _personsimplehike: ImageVector? = null
