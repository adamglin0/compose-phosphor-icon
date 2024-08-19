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

public val FillGroup.`Wave-triangle-fill`: ImageVector
    get() {
        if (`_wave-triangle-fill` != null) {
            return `_wave-triangle-fill`!!
        }
        `_wave-triangle-fill` = Builder(name = "Wave-triangle-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(206.15f, 133.12f)
                lineTo(166.15f, 181.12f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 184.0f)
                horizontalLineToRelative(-0.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.23f, -3.55f)
                lineToRelative(-58.0f, -87.09f)
                lineTo(62.15f, 133.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.3f, -10.24f)
                lineToRelative(40.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.81f, 0.68f)
                lineToRelative(58.05f, 87.09f)
                lineToRelative(33.14f, -39.77f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.3f, 10.24f)
                close()
            }
        }
        .build()
        return `_wave-triangle-fill`!!
    }

private var `_wave-triangle-fill`: ImageVector? = null
