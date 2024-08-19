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

public val LightGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.0f, 88.18f)
                arcToRelative(52.42f, 52.42f, 0.0f, false, true, -15.4f, 35.66f)
                lineToRelative(-34.75f, 34.75f)
                arcTo(52.28f, 52.28f, 0.0f, false, true, 150.62f, 174.0f)
                horizontalLineToRelative(-0.05f)
                arcTo(52.63f, 52.63f, 0.0f, false, true, 98.0f, 119.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -5.84f)
                horizontalLineToRelative(0.17f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.83f, 6.16f)
                arcTo(40.62f, 40.62f, 0.0f, false, false, 150.58f, 162.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(40.4f, 40.4f, 0.0f, false, false, 28.73f, -11.9f)
                lineToRelative(34.75f, -34.74f)
                arcTo(40.63f, 40.63f, 0.0f, false, false, 156.63f, 57.9f)
                lineToRelative(-11.0f, 11.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.49f, -8.49f)
                lineToRelative(11.0f, -11.0f)
                arcToRelative(52.62f, 52.62f, 0.0f, false, true, 74.43f, 0.0f)
                arcTo(52.83f, 52.83f, 0.0f, false, true, 238.0f, 88.18f)
                close()
                moveTo(110.38f, 187.08f)
                lineTo(99.38f, 198.08f)
                arcTo(40.36f, 40.36f, 0.0f, false, true, 70.6f, 210.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(40.63f, 40.63f, 0.0f, false, true, -28.7f, -69.36f)
                lineTo(76.62f, 105.9f)
                arcTo(40.63f, 40.63f, 0.0f, false, true, 146.0f, 135.77f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.83f, 6.16f)
                lineTo(152.0f, 141.93f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -5.84f)
                arcTo(52.63f, 52.63f, 0.0f, false, false, 68.14f, 97.42f)
                lineTo(33.38f, 132.16f)
                arcTo(52.63f, 52.63f, 0.0f, false, false, 70.56f, 222.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(52.26f, 52.26f, 0.0f, false, false, 37.22f, -15.42f)
                lineToRelative(11.0f, -11.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.49f, -8.48f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
