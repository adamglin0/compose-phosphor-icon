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

public val LightGroup.`Gender-neuter-light`: ImageVector
    get() {
        if (`_gender-neuter-light` != null) {
            return `_gender-neuter-light`!!
        }
        `_gender-neuter-light` = Builder(name = "Gender-neuter-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.0f, 104.0f)
                arcToRelative(78.0f, 78.0f, 0.0f, true, false, -84.0f, 77.75f)
                lineTo(122.0f, 232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 181.75f)
                arcTo(78.09f, 78.09f, 0.0f, false, false, 206.0f, 104.0f)
                close()
                moveTo(128.0f, 170.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, true, 66.0f, -66.0f)
                arcTo(66.08f, 66.08f, 0.0f, false, true, 128.0f, 170.0f)
                close()
            }
        }
        .build()
        return `_gender-neuter-light`!!
    }

private var `_gender-neuter-light`: ImageVector? = null
