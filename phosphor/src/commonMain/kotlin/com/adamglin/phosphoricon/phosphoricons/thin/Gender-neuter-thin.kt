package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Gender-neuter-thin`: ImageVector
    get() {
        if (`_gender-neuter-thin` != null) {
            return `_gender-neuter-thin`!!
        }
        `_gender-neuter-thin` = Builder(name = "Gender-neuter-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 104.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, -80.0f, 75.89f)
                lineTo(124.0f, 232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 179.89f)
                arcTo(76.09f, 76.09f, 0.0f, false, false, 204.0f, 104.0f)
                close()
                moveTo(128.0f, 172.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 68.0f, -68.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, true, 128.0f, 172.0f)
                close()
            }
        }
        .build()
        return `_gender-neuter-thin`!!
    }

private var `_gender-neuter-thin`: ImageVector? = null
