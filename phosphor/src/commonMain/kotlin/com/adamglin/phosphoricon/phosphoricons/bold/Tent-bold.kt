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

public val BoldGroup.`Tent-bold`: ImageVector
    get() {
        if (`_tent-bold` != null) {
            return `_tent-bold`!!
        }
        `_tent-bold` = Builder(name = "Tent-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.0f, 187.13f)
                lineToRelative(-64.0f, -144.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 180.0f, 36.0f)
                lineTo(76.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.85f, 6.9f)
                arcToRelative(2.42f, 2.42f, 0.0f, false, false, -0.12f, 0.23f)
                lineTo(65.0f, 43.3f)
                arcToRelative(0.08f, 0.08f, 0.0f, false, false, 0.0f, 0.0f)
                lineTo(1.0f, 187.13f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 204.0f)
                lineTo(244.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.0f, -16.87f)
                close()
                moveTo(64.0f, 104.55f)
                lineTo(64.0f, 180.0f)
                lineTo(30.46f, 180.0f)
                close()
                moveTo(88.0f, 180.0f)
                lineTo(88.0f, 104.55f)
                lineTo(121.54f, 180.0f)
                close()
                moveTo(147.8f, 180.0f)
                lineTo(94.47f, 60.0f)
                lineTo(172.2f, 60.0f)
                lineToRelative(53.34f, 120.0f)
                close()
            }
        }
        .build()
        return `_tent-bold`!!
    }

private var `_tent-bold`: ImageVector? = null
