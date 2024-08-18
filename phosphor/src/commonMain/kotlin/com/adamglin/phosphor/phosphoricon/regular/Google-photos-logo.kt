package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Google-photos-logo`: ImageVector
    get() {
        if (`_google-photos-logo` != null) {
            return `_google-photos-logo`!!
        }
        `_google-photos-logo` = Builder(name = "Google-photos-logo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 120.0f)
                lineTo(192.49f, 120.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 128.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(120.0f, 63.51f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 16.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(63.51f, 136.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 128.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(136.0f, 192.49f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 240.0f, 128.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 120.0f)
                close()
                moveTo(184.0f, 88.0f)
                arcTo(55.31f, 55.31f, 0.0f, false, true, 174.0f, 120.0f)
                lineTo(136.0f, 120.0f)
                lineTo(136.0f, 32.57f)
                arcTo(56.09f, 56.09f, 0.0f, false, true, 184.0f, 88.0f)
                close()
                moveTo(88.0f, 72.0f)
                arcToRelative(55.31f, 55.31f, 0.0f, false, true, 32.0f, 10.0f)
                verticalLineToRelative(38.0f)
                lineTo(32.57f, 120.0f)
                arcTo(56.09f, 56.09f, 0.0f, false, true, 88.0f, 72.0f)
                close()
                moveTo(72.0f, 168.0f)
                arcToRelative(55.31f, 55.31f, 0.0f, false, true, 10.0f, -32.0f)
                horizontalLineToRelative(38.0f)
                verticalLineToRelative(87.43f)
                arcTo(56.09f, 56.09f, 0.0f, false, true, 72.0f, 168.0f)
                close()
                moveTo(168.0f, 184.0f)
                arcTo(55.31f, 55.31f, 0.0f, false, true, 136.0f, 174.0f)
                lineTo(136.0f, 136.0f)
                horizontalLineToRelative(87.43f)
                arcTo(56.09f, 56.09f, 0.0f, false, true, 168.0f, 184.0f)
                close()
            }
        }
        .build()
        return `_google-photos-logo`!!
    }

private var `_google-photos-logo`: ImageVector? = null
