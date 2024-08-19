package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Spinner-gap`: ImageVector
    get() {
        if (`_spinner-gap` != null) {
            return `_spinner-gap`!!
        }
        `_spinner-gap` = Builder(name = "Spinner-gap", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 32.0f)
                lineTo(136.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(224.0f, 120.0f)
                lineTo(192.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(178.91f, 167.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, 11.31f)
                lineToRelative(22.62f, 22.63f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                close()
                moveTo(128.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 192.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 184.0f)
                close()
                moveTo(77.09f, 167.6f)
                lineTo(54.46f, 190.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineTo(88.4f, 178.91f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 77.09f, 167.6f)
                close()
                moveTo(72.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(32.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(64.0f, 136.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 128.0f)
                close()
                moveTo(65.78f, 54.46f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 54.46f, 65.78f)
                lineTo(77.09f, 88.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.4f, 77.09f)
                close()
            }
        }
        .build()
        return `_spinner-gap`!!
    }

private var `_spinner-gap`: ImageVector? = null
