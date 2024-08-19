package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Person-arms-spread-light`: ImageVector
    get() {
        if (`_person-arms-spread-light` != null) {
            return `_person-arms-spread-light`!!
        }
        `_person-arms-spread-light` = Builder(name = "Person-arms-spread-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 70.0f)
                arcTo(30.0f, 30.0f, 0.0f, true, false, 98.0f, 40.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 128.0f, 70.0f)
                close()
                moveTo(128.0f, 22.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 128.0f, 22.0f)
                close()
                moveTo(229.55f, 88.14f)
                arcTo(17.66f, 17.66f, 0.0f, false, false, 212.0f, 74.0f)
                lineTo(44.0f, 74.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -7.55f, 34.34f)
                lineToRelative(0.1f, 0.0f)
                lineToRelative(52.32f, 23.0f)
                lineToRelative(-21.44f, 81.5f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 84.0f, 238.0f)
                arcToRelative(18.07f, 18.07f, 0.0f, false, false, 16.19f, -10.14f)
                lineTo(128.0f, 180.0f)
                lineToRelative(27.81f, 47.91f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 32.73f, -14.94f)
                lineToRelative(-21.44f, -81.5f)
                lineToRelative(52.32f, -23.0f)
                lineToRelative(0.1f, 0.0f)
                arcTo(17.66f, 17.66f, 0.0f, false, false, 229.55f, 88.14f)
                close()
                moveTo(214.55f, 97.43f)
                lineTo(157.6f, 122.51f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.39f, 7.0f)
                lineToRelative(22.87f, 86.93f)
                arcToRelative(7.66f, 7.66f, 0.0f, false, false, 0.37f, 1.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.88f, 5.07f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, -0.24f, -0.48f)
                lineTo(133.19f, 165.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.38f, 0.0f)
                lineTo(89.69f, 222.05f)
                curveToRelative(-0.09f, 0.16f, -0.17f, 0.31f, -0.25f, 0.48f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.0f, 2.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.9f, -8.0f)
                arcToRelative(7.66f, 7.66f, 0.0f, false, false, 0.37f, -1.0f)
                lineToRelative(22.87f, -86.93f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.39f, -7.0f)
                lineTo(41.47f, 97.43f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 44.0f, 86.0f)
                lineTo(212.0f, 86.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.56f, 11.43f)
                close()
            }
        }
        .build()
        return `_person-arms-spread-light`!!
    }

private var `_person-arms-spread-light`: ImageVector? = null
