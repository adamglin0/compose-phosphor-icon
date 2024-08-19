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

public val LightGroup.`Percent-light`: ImageVector
    get() {
        if (`_percent-light` != null) {
            return `_percent-light`!!
        }
        `_percent-light` = Builder(name = "Percent-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.24f, 60.23f)
                lineToRelative(-144.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineToRelative(144.0f, -144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.48f, 8.49f)
                close()
                moveTo(52.0f, 100.0f)
                arcTo(34.0f, 34.0f, 0.0f, true, true, 76.0f, 110.0f)
                arcTo(33.78f, 33.78f, 0.0f, false, true, 52.0f, 100.0f)
                close()
                moveTo(54.0f, 76.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, 6.44f, -15.56f)
                arcTo(21.86f, 21.86f, 0.0f, false, false, 54.0f, 76.0f)
                close()
                moveTo(214.0f, 180.0f)
                arcTo(34.0f, 34.0f, 0.0f, true, true, 204.0f, 156.0f)
                arcTo(33.78f, 33.78f, 0.0f, false, true, 214.0f, 180.0f)
                close()
                moveTo(202.0f, 180.0f)
                arcToRelative(21.87f, 21.87f, 0.0f, false, false, -6.44f, -15.56f)
                horizontalLineToRelative(0.0f)
                arcTo(22.0f, 22.0f, 0.0f, true, false, 202.0f, 180.0f)
                close()
            }
        }
        .build()
        return `_percent-light`!!
    }

private var `_percent-light`: ImageVector? = null
