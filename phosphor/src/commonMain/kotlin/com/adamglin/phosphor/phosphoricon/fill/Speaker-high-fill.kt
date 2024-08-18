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

public val FillGroup.`Speaker-high-fill`: ImageVector
    get() {
        if (`_speaker-high-fill` != null) {
            return `_speaker-high-fill`!!
        }
        `_speaker-high-fill` = Builder(name = "Speaker-high-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 32.25f)
                lineTo(160.0f, 223.69f)
                arcToRelative(8.29f, 8.29f, 0.0f, false, true, -3.91f, 7.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.0f, -0.56f)
                lineToRelative(-65.57f, -51.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 80.0f, 176.16f)
                lineTo(80.0f, 79.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.55f, -3.15f)
                lineToRelative(65.57f, -51.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.0f, 0.16f)
                arcTo(8.27f, 8.27f, 0.0f, false, true, 160.0f, 32.25f)
                close()
                moveTo(60.0f, 80.0f)
                lineTo(32.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(60.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(64.0f, 84.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 60.0f, 80.0f)
                close()
                moveTo(186.77f, 100.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.72f, 11.3f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 31.72f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.0f, 10.58f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, -52.88f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 186.74f, 100.84f)
                close()
                moveTo(227.66f, 74.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.92f, 10.66f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 0.0f, 85.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.92f, 10.66f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 0.0f, -106.66f)
                close()
            }
        }
        .build()
        return `_speaker-high-fill`!!
    }

private var `_speaker-high-fill`: ImageVector? = null
