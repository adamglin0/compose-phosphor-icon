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

public val BoldGroup.`Four-k-bold`: ImageVector
    get() {
        if (`_four-k-bold` != null) {
            return `_four-k-bold`!!
        }
        `_four-k-bold` = Builder(name = "Four-k-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 32.0f, 32.0f)
                lineTo(224.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(32.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 20.0f, 44.0f)
                close()
                moveTo(224.0f, 200.0f)
                lineTo(32.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(224.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(148.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(160.0f, 148.51f)
                lineToRelative(8.44f, -9.65f)
                lineToRelative(25.19f, 43.19f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 214.37f, 170.0f)
                lineToRelative(-29.26f, -50.14f)
                lineTo(213.0f, 87.9f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 195.0f, 72.1f)
                lineToRelative(-35.0f, 40.0f)
                lineTo(160.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 148.0f, 68.0f)
                close()
                moveTo(80.0f, 176.0f)
                lineTo(80.0f, 164.0f)
                lineTo(36.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.47f, -19.37f)
                lineToRelative(56.0f, -72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 80.0f)
                verticalLineToRelative(60.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(80.0f, 140.0f)
                lineTo(80.0f, 115.0f)
                lineTo(60.54f, 140.0f)
                close()
            }
        }
        .build()
        return `_four-k-bold`!!
    }

private var `_four-k-bold`: ImageVector? = null
