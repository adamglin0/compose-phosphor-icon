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

public val FillGroup.`Apple-podcasts-logo-fill`: ImageVector
    get() {
        if (`_apple-podcasts-logo-fill` != null) {
            return `_apple-podcasts-logo-fill`!!
        }
        `_apple-podcasts-logo-fill` = Builder(name = "Apple-podcasts-logo-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(159.8f, 151.82f)
                arcToRelative(19.67f, 19.67f, 0.0f, false, true, 3.58f, 17.05f)
                lineToRelative(-12.18f, 48.0f)
                arcTo(20.17f, 20.17f, 0.0f, false, true, 131.56f, 232.0f)
                horizontalLineToRelative(-7.12f)
                arcToRelative(20.17f, 20.17f, 0.0f, false, true, -19.64f, -15.13f)
                lineToRelative(-12.18f, -48.0f)
                arcToRelative(19.67f, 19.67f, 0.0f, false, true, 3.58f, -17.05f)
                arcToRelative(20.17f, 20.17f, 0.0f, false, true, 16.0f, -7.82f)
                horizontalLineToRelative(31.5f)
                arcTo(20.17f, 20.17f, 0.0f, false, true, 159.8f, 151.82f)
                close()
                moveTo(156.0f, 116.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 156.0f, 116.0f)
                close()
                moveTo(182.0f, 143.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 15.41f, 4.29f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, -138.74f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 74.0f, 143.0f)
                arcTo(56.0f, 56.0f, 0.0f, true, true, 182.0f, 143.0f)
                close()
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 70.18f, 214.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.9f, -13.3f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 97.84f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.9f, 13.3f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 128.0f, 24.0f)
                close()
            }
        }
        .build()
        return `_apple-podcasts-logo-fill`!!
    }

private var `_apple-podcasts-logo-fill`: ImageVector? = null
