package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Compass-fill`: ImageVector
    get() {
        if (`_compass-fill` != null) {
            return `_compass-fill`!!
        }
        `_compass-fill` = Builder(name = "Compass-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(179.58f, 81.79f)
                lineTo(147.58f, 145.79f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, true, -1.79f, 1.79f)
                lineToRelative(-64.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.37f, -5.37f)
                lineToRelative(32.0f, -64.0f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, true, 1.79f, -1.79f)
                lineToRelative(64.0f, -32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 179.58f, 81.79f)
                close()
            }
        }
        .build()
        return `_compass-fill`!!
    }

private var `_compass-fill`: ImageVector? = null
