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

public val FillGroup.`Speaker-simple-high-fill`: ImageVector
    get() {
        if (`_speaker-simple-high-fill` != null) {
            return `_speaker-simple-high-fill`!!
        }
        `_speaker-simple-high-fill` = Builder(name = "Speaker-simple-high-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 32.0f)
                lineTo(168.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.91f, 6.31f)
                lineTo(85.25f, 176.0f)
                lineTo(40.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 80.0f)
                lineTo(85.25f, 80.0f)
                lineToRelative(69.84f, -54.31f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 32.0f)
                close()
                moveTo(200.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(208.0f, 104.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 96.0f)
                close()
                moveTo(232.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(240.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 80.0f)
                close()
            }
        }
        .build()
        return `_speaker-simple-high-fill`!!
    }

private var `_speaker-simple-high-fill`: ImageVector? = null
