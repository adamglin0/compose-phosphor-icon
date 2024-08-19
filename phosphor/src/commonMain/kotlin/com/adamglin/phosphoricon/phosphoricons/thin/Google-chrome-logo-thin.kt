package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Google-chrome-logo-thin`: ImageVector
    get() {
        if (`_google-chrome-logo-thin` != null) {
            return `_google-chrome-logo-thin`!!
        }
        `_google-chrome-logo-thin` = Builder(name = "Google-chrome-logo-thin", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(92.08f, 92.08f, 0.0f, false, true, 80.78f, 48.0f)
                lineTo(128.0f, 84.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, -43.82f, 40.11f)
                lineTo(54.51f, 72.72f)
                arcTo(91.9f, 91.9f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 128.0f, 164.0f)
                close()
                moveTo(36.0f, 128.0f)
                arcTo(91.52f, 91.52f, 0.0f, false, true, 49.51f, 80.05f)
                lineTo(89.9f, 150.0f)
                curveToRelative(0.0f, 0.09f, 0.11f, 0.17f, 0.17f, 0.26f)
                arcToRelative(43.93f, 43.93f, 0.0f, false, false, 56.47f, 17.63f)
                lineToRelative(-29.7f, 51.43f)
                arcTo(92.13f, 92.13f, 0.0f, false, true, 36.0f, 128.0f)
                close()
                moveTo(128.0f, 220.0f)
                curveToRelative(-0.77f, 0.0f, -1.53f, 0.0f, -2.29f, 0.0f)
                lineToRelative(40.39f, -70.0f)
                arcToRelative(1.21f, 1.21f, 0.0f, false, false, 0.09f, -0.2f)
                arcTo(43.89f, 43.89f, 0.0f, false, false, 153.25f, 92.0f)
                horizontalLineToRelative(59.41f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return `_google-chrome-logo-thin`!!
    }

private var `_google-chrome-logo-thin`: ImageVector? = null
