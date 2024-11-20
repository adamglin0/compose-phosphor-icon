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

public val LightGroup.UmbrellaSimple: ImageVector
    get() {
        if (_umbrellaSimple != null) {
            return _umbrellaSimple!!
        }
        _umbrellaSimple = Builder(name = "UmbrellaSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.0f, 126.79f)
                arcTo(110.43f, 110.43f, 0.0f, false, false, 53.11f, 55.22f)
                arcToRelative(109.51f, 109.51f, 0.0f, false, false, -35.06f, 71.57f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 32.0f, 142.0f)
                horizontalLineToRelative(90.0f)
                verticalLineToRelative(58.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 60.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -36.0f, 0.0f)
                lineTo(134.0f, 142.0f)
                horizontalLineToRelative(90.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -15.21f)
                close()
                moveTo(225.51f, 129.35f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 224.0f, 130.0f)
                lineTo(32.0f, 130.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.49f, -0.65f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.53f, -1.56f)
                arcTo(98.43f, 98.43f, 0.0f, false, true, 194.76f, 64.05f)
                arcTo(97.5f, 97.5f, 0.0f, false, true, 226.0f, 127.79f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 225.46f, 129.35f)
                close()
            }
        }
        .build()
        return _umbrellaSimple!!
    }

private var _umbrellaSimple: ImageVector? = null
