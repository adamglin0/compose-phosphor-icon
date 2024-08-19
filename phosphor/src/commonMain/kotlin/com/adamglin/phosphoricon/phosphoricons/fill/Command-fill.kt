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

public val FillGroup.`Command-fill`: ImageVector
    get() {
        if (`_command-fill` != null) {
            return `_command-fill`!!
        }
        `_command-fill` = Builder(name = "Command-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 116.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                lineTo(116.0f, 140.0f)
                close()
                moveTo(86.0f, 72.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 28.0f)
                horizontalLineToRelative(14.0f)
                lineTo(100.0f, 86.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 86.0f, 72.0f)
                close()
                moveTo(184.0f, 86.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -28.0f, 0.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 184.0f, 86.0f)
                close()
                moveTo(72.0f, 170.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 28.0f, 0.0f)
                lineTo(100.0f, 156.0f)
                lineTo(86.0f, 156.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 72.0f, 170.0f)
                close()
                moveTo(224.0f, 48.0f)
                lineTo(224.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f)
                lineTo(208.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f)
                close()
                moveTo(156.0f, 140.0f)
                lineTo(156.0f, 116.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -30.0f, -30.0f)
                verticalLineToRelative(14.0f)
                lineTo(116.0f, 100.0f)
                lineTo(116.0f, 86.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -30.0f, 30.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(24.0f)
                lineTo(86.0f, 140.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 30.0f, 30.0f)
                lineTo(116.0f, 156.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 30.0f, -30.0f)
                close()
                moveTo(156.0f, 170.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, false, 14.0f, -14.0f)
                lineTo(156.0f, 156.0f)
                close()
            }
        }
        .build()
        return `_command-fill`!!
    }

private var `_command-fill`: ImageVector? = null
