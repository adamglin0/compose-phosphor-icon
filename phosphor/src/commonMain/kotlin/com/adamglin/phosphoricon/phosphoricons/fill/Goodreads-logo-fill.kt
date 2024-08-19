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

public val FillGroup.`Goodreads-logo-fill`: ImageVector
    get() {
        if (`_goodreads-logo-fill` != null) {
            return `_goodreads-logo-fill`!!
        }
        `_goodreads-logo-fill` = Builder(name = "Goodreads-logo-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 24.0f)
                close()
                moveTo(176.0f, 160.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -86.4f, 28.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.8f, -9.6f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 160.0f, 160.0f)
                lineTo(160.0f, 147.74f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 80.0f, 112.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 80.0f, -35.74f)
                lineTo(160.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(160.0f, 104.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -64.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_goodreads-logo-fill`!!
    }

private var `_goodreads-logo-fill`: ImageVector? = null
