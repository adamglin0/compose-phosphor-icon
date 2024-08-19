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

public val BoldGroup.`Onigiri-bold`: ImageVector
    get() {
        if (`_onigiri-bold` != null) {
            return `_onigiri-bold`!!
        }
        `_onigiri-bold` = Builder(name = "Onigiri-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.0f, 144.51f)
                lineTo(179.13f, 48.65f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -0.17f, -0.29f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 77.0f, 48.36f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -0.17f, 0.29f)
                lineTo(21.0f, 144.51f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 72.1f, 236.0f)
                lineTo(183.9f, 236.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 235.0f, 144.51f)
                close()
                moveTo(156.0f, 212.0f)
                lineTo(100.0f, 212.0f)
                lineTo(100.0f, 172.0f)
                horizontalLineToRelative(56.0f)
                close()
                moveTo(215.36f, 193.5f)
                arcTo(35.55f, 35.55f, 0.0f, false, true, 183.9f, 212.0f)
                lineTo(180.0f, 212.0f)
                lineTo(180.0f, 168.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(96.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(44.0f)
                lineTo(72.1f, 212.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -30.58f, -55.0f)
                lineToRelative(0.17f, -0.28f)
                lineTo(97.51f, 60.88f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 61.0f, 0.0f)
                lineToRelative(55.82f, 95.85f)
                lineToRelative(0.17f, 0.28f)
                arcTo(35.58f, 35.58f, 0.0f, false, true, 215.35f, 193.5f)
                close()
            }
        }
        .build()
        return `_onigiri-bold`!!
    }

private var `_onigiri-bold`: ImageVector? = null
