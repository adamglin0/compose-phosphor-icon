package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Spinner-gap-light`: ImageVector
    get() {
        if (`_spinner-gap-light` != null) {
            return `_spinner-gap-light`!!
        }
        `_spinner-gap-light` = Builder(name = "Spinner-gap-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.0f, 32.0f)
                lineTo(134.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(224.0f, 122.0f)
                lineTo(192.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(177.5f, 169.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 169.0f, 177.5f)
                lineToRelative(22.63f, 22.62f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                close()
                moveTo(128.0f, 186.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 192.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 128.0f, 186.0f)
                close()
                moveTo(78.5f, 169.0f)
                lineTo(55.88f, 191.64f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineTo(87.0f, 177.5f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 78.5f, 169.0f)
                close()
                moveTo(70.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(32.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(64.0f, 134.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 70.0f, 128.0f)
                close()
                moveTo(64.36f, 55.88f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineTo(78.5f, 87.0f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 87.0f, 78.5f)
                close()
            }
        }
        .build()
        return `_spinner-gap-light`!!
    }

private var `_spinner-gap-light`: ImageVector? = null
