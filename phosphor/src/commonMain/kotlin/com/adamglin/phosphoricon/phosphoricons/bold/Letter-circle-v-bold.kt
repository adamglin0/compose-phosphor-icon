package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Letter-circle-v-bold`: ImageVector
    get() {
        if (`_letter-circle-v-bold` != null) {
            return `_letter-circle-v-bold`!!
        }
        `_letter-circle-v-bold` = Builder(name = "Letter-circle-v-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(171.14f, 100.46f)
                lineTo(139.14f, 180.46f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.28f, 0.0f)
                lineToRelative(-32.0f, -80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 22.28f, -8.92f)
                lineTo(128.0f, 143.69f)
                lineToRelative(20.86f, -52.15f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 22.28f, 8.92f)
                close()
            }
        }
        .build()
        return `_letter-circle-v-bold`!!
    }

private var `_letter-circle-v-bold`: ImageVector? = null
