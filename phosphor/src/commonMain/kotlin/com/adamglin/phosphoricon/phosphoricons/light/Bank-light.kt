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

public val LightGroup.`Bank-light`: ImageVector
    get() {
        if (`_bank-light` != null) {
            return `_bank-light`!!
        }
        `_bank-light` = Builder(name = "Bank-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 102.0f)
                lineTo(50.0f, 102.0f)
                verticalLineToRelative(68.0f)
                lineTo(32.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(224.0f, 182.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(206.0f, 170.0f)
                lineTo(206.0f, 102.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.14f, -11.11f)
                lineToRelative(-104.0f, -64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.28f, 0.0f)
                lineToRelative(-104.0f, 64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 24.0f, 102.0f)
                close()
                moveTo(62.0f, 102.0f)
                lineTo(98.0f, 102.0f)
                verticalLineToRelative(68.0f)
                lineTo(62.0f, 170.0f)
                close()
                moveTo(146.0f, 102.0f)
                verticalLineToRelative(68.0f)
                lineTo(110.0f, 170.0f)
                lineTo(110.0f, 102.0f)
                close()
                moveTo(194.0f, 170.0f)
                lineTo(158.0f, 170.0f)
                lineTo(158.0f, 102.0f)
                horizontalLineToRelative(36.0f)
                close()
                moveTo(128.0f, 39.0f)
                lineToRelative(82.8f, 51.0f)
                lineTo(45.2f, 90.0f)
                close()
                moveTo(246.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(16.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(240.0f, 202.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 208.0f)
                close()
            }
        }
        .build()
        return `_bank-light`!!
    }

private var `_bank-light`: ImageVector? = null
