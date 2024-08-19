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

public val LightGroup.`Phosphor-logo-light`: ImageVector
    get() {
        if (`_phosphor-logo-light` != null) {
            return `_phosphor-logo-light`!!
        }
        `_phosphor-logo-light` = Builder(name = "Phosphor-logo-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 34.0f)
                lineTo(72.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(66.0f, 168.0f)
                arcToRelative(78.09f, 78.09f, 0.0f, false, false, 78.0f, 78.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(150.0f, 174.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, false, 0.0f, -140.0f)
                close()
                moveTo(78.0f, 62.91f)
                lineTo(133.74f, 162.0f)
                lineTo(78.0f, 162.0f)
                close()
                moveTo(138.0f, 145.1f)
                lineTo(82.26f, 46.0f)
                lineTo(138.0f, 46.0f)
                close()
                moveTo(78.28f, 174.0f)
                lineTo(138.0f, 174.0f)
                verticalLineToRelative(59.73f)
                arcTo(66.1f, 66.1f, 0.0f, false, true, 78.28f, 174.0f)
                close()
                moveTo(152.0f, 162.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(150.0f, 46.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, 0.0f, 116.0f)
                close()
            }
        }
        .build()
        return `_phosphor-logo-light`!!
    }

private var `_phosphor-logo-light`: ImageVector? = null
