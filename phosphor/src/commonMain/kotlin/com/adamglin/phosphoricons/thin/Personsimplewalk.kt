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

public val ThinGroup.PersonSimpleWalk: ImageVector
    get() {
        if (_personSimpleWalk != null) {
            return _personSimpleWalk!!
        }
        _personSimpleWalk = Builder(name = "PersonSimpleWalk", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(212.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                curveToRelative(-33.65f, 0.0f, -49.92f, -16.43f, -64.28f, -30.93f)
                curveToRelative(-3.52f, -3.57f, -6.86f, -6.93f, -10.34f, -10.0f)
                curveToRelative(-0.66f, -0.57f, -1.34f, -1.09f, -2.0f, -1.59f)
                lineToRelative(-16.86f, 38.77f)
                lineToRelative(39.84f, 28.45f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 156.0f, 176.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(148.0f, 178.06f)
                lineTo(111.23f, 151.8f)
                lineTo(75.67f, 233.59f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -7.34f, -3.19f)
                lineToRelative(55.93f, -128.62f)
                curveToRelative(-29.7f, -10.55f, -73.0f, 29.64f, -73.52f, 30.09f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 45.26f, 126.0f)
                arcTo(173.4f, 173.4f, 0.0f, false, true, 78.1f, 102.59f)
                curveToRelative(25.15f, -13.54f, 46.07f, -14.06f, 60.52f, -1.52f)
                curveToRelative(3.71f, 3.23f, 7.15f, 6.7f, 10.79f, 10.37f)
                curveToRelative(13.9f, 14.0f, 28.28f, 28.56f, 58.59f, 28.56f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 144.0f)
                close()
            }
        }
        .build()
        return _personSimpleWalk!!
    }

private var _personSimpleWalk: ImageVector? = null
