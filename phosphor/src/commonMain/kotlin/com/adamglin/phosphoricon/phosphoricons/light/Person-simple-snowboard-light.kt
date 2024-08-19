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

public val LightGroup.`Person-simple-snowboard-light`: ImageVector
    get() {
        if (`_person-simple-snowboard-light` != null) {
            return `_person-simple-snowboard-light`!!
        }
        `_person-simple-snowboard-light` = Builder(name = "Person-simple-snowboard-light",
                defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f,
                viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 78.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, -26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 164.0f, 78.0f)
                close()
                moveTo(164.0f, 38.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 164.0f, 38.0f)
                close()
                moveTo(217.69f, 114.24f)
                lineTo(81.69f, 74.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -3.38f, 11.51f)
                lineToRelative(43.45f, 12.78f)
                lineTo(85.92f, 152.3f)
                lineTo(39.79f, 138.93f)
                arcToRelative(23.19f, 23.19f, 0.0f, false, false, -20.54f, 3.75f)
                arcTo(23.0f, 23.0f, 0.0f, false, false, 10.0f, 161.18f)
                arcToRelative(23.32f, 23.32f, 0.0f, false, false, 16.77f, 22.25f)
                horizontalLineToRelative(0.0f)
                lineToRelative(157.44f, 45.63f)
                arcToRelative(23.67f, 23.67f, 0.0f, false, false, 6.58f, 0.94f)
                arcToRelative(23.17f, 23.17f, 0.0f, false, false, 6.44f, -45.44f)
                lineToRelative(-53.52f, -15.51f)
                lineTo(165.0f, 137.34f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.31f, -9.11f)
                lineToRelative(-38.0f, -11.0f)
                lineToRelative(10.11f, -15.16f)
                lineToRelative(80.49f, 23.67f)
                arcTo(5.82f, 5.82f, 0.0f, false, false, 216.0f, 126.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.69f, -11.76f)
                close()
                moveTo(202.0f, 206.81f)
                arcToRelative(11.05f, 11.05f, 0.0f, false, true, -4.46f, 8.9f)
                arcToRelative(11.26f, 11.26f, 0.0f, false, true, -10.0f, 1.82f)
                lineTo(30.11f, 171.9f)
                horizontalLineToRelative(0.0f)
                arcTo(11.24f, 11.24f, 0.0f, false, true, 22.0f, 161.18f)
                arcToRelative(11.05f, 11.05f, 0.0f, false, true, 4.46f, -8.9f)
                arcToRelative(11.26f, 11.26f, 0.0f, false, true, 10.0f, -1.82f)
                lineToRelative(157.44f, 45.63f)
                arcTo(11.24f, 11.24f, 0.0f, false, true, 202.0f, 206.81f)
                close()
                moveTo(150.44f, 137.47f)
                lineTo(131.61f, 165.54f)
                lineTo(98.0f, 155.8f)
                lineToRelative(18.73f, -28.09f)
                close()
            }
        }
        .build()
        return `_person-simple-snowboard-light`!!
    }

private var `_person-simple-snowboard-light`: ImageVector? = null
