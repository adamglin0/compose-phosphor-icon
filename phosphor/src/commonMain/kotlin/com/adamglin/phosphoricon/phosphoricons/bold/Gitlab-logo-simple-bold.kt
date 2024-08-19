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

public val BoldGroup.`Gitlab-logo-simple-bold`: ImageVector
    get() {
        if (`_gitlab-logo-simple-bold` != null) {
            return `_gitlab-logo-simple-bold`!!
        }
        `_gitlab-logo-simple-bold` = Builder(name = "Gitlab-logo-simple-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.0f, 116.09f)
                lineTo(214.13f, 40.0f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, -30.42f, -1.48f)
                lineTo(167.0f, 84.0f)
                horizontalLineTo(89.0f)
                lineTo(72.29f, 38.49f)
                arcTo(15.94f, 15.94f, 0.0f, false, false, 41.87f, 40.0f)
                lineTo(22.0f, 116.09f)
                arcToRelative(61.19f, 61.19f, 0.0f, false, false, 23.57f, 65.23f)
                lineToRelative(73.27f, 51.77f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, 18.36f, 0.0f)
                lineToRelative(73.27f, -51.77f)
                arcTo(61.19f, 61.19f, 0.0f, false, false, 234.0f, 116.09f)
                close()
                moveTo(196.6f, 161.72f)
                lineTo(128.0f, 210.19f)
                lineTo(59.4f, 161.72f)
                arcToRelative(37.08f, 37.08f, 0.0f, false, true, -14.19f, -39.56f)
                lineToRelative(13.4f, -51.3f)
                lineToRelative(10.76f, 29.28f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 80.64f, 108.0f)
                horizontalLineToRelative(94.72f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.27f, -7.86f)
                lineToRelative(10.76f, -29.28f)
                lineToRelative(13.4f, 51.3f)
                arcTo(37.08f, 37.08f, 0.0f, false, true, 196.6f, 161.72f)
                close()
            }
        }
        .build()
        return `_gitlab-logo-simple-bold`!!
    }

private var `_gitlab-logo-simple-bold`: ImageVector? = null
