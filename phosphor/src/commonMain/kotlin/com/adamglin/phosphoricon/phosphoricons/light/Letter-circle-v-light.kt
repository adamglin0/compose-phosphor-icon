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

public val LightGroup.`Letter-circle-v-light`: ImageVector
    get() {
        if (`_letter-circle-v-light` != null) {
            return `_letter-circle-v-light`!!
        }
        `_letter-circle-v-light` = Builder(name = "Letter-circle-v-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(165.57f, 98.23f)
                lineToRelative(-32.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.14f, 0.0f)
                lineToRelative(-32.0f, -80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.14f, -4.46f)
                lineTo(128.0f, 159.84f)
                lineToRelative(26.43f, -66.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.14f, 4.46f)
                close()
            }
        }
        .build()
        return `_letter-circle-v-light`!!
    }

private var `_letter-circle-v-light`: ImageVector? = null
