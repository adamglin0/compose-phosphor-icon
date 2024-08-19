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

public val BoldGroup.`Google-logo-bold`: ImageVector
    get() {
        if (`_google-logo-bold` != null) {
            return `_google-logo-bold`!!
        }
        `_google-logo-bold` = Builder(name = "Google-logo-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 128.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, true, true, -22.86f, -63.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -18.51f, 15.28f)
                arcTo(76.0f, 76.0f, 0.0f, true, false, 203.05f, 140.0f)
                horizontalLineTo(128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_google-logo-bold`!!
    }

private var `_google-logo-bold`: ImageVector? = null
