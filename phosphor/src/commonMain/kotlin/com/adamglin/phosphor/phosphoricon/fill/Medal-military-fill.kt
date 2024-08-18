package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Medal-military-fill`: ImageVector
    get() {
        if (`_medal-military-fill` != null) {
            return `_medal-military-fill`!!
        }
        `_medal-military-fill` = Builder(name = "Medal-military-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.0f, 40.0f)
                lineTo(49.0f, 40.0f)
                arcTo(17.0f, 17.0f, 0.0f, false, false, 32.0f, 57.0f)
                verticalLineToRelative(49.21f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, 10.0f, 15.47f)
                lineToRelative(62.6f, 28.45f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 46.88f, 0.0f)
                lineTo(214.0f, 121.68f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, 10.0f, -15.47f)
                lineTo(224.0f, 57.0f)
                arcTo(17.0f, 17.0f, 0.0f, false, false, 207.0f, 40.0f)
                close()
                moveTo(96.0f, 56.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(72.67f)
                lineToRelative(-32.0f, 14.54f)
                lineTo(96.0f, 128.67f)
                close()
                moveTo(128.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 224.0f)
                close()
            }
        }
        .build()
        return `_medal-military-fill`!!
    }

private var `_medal-military-fill`: ImageVector? = null
