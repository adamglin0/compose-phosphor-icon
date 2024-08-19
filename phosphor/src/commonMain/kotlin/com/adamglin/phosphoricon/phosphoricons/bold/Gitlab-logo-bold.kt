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

public val BoldGroup.`Gitlab-logo-bold`: ImageVector
    get() {
        if (`_gitlab-logo-bold` != null) {
            return `_gitlab-logo-bold`!!
        }
        `_gitlab-logo-bold` = Builder(name = "Gitlab-logo-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.0f, 116.09f)
                lineTo(214.13f, 40.0f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, -30.42f, -1.48f)
                lineTo(167.0f, 84.0f)
                lineTo(89.0f, 84.0f)
                lineTo(72.29f, 38.49f)
                arcTo(15.94f, 15.94f, 0.0f, false, false, 41.87f, 40.0f)
                lineTo(22.0f, 116.09f)
                arcToRelative(61.19f, 61.19f, 0.0f, false, false, 23.57f, 65.23f)
                lineToRelative(73.27f, 51.77f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, 18.36f, 0.0f)
                lineToRelative(73.27f, -51.77f)
                arcTo(61.19f, 61.19f, 0.0f, false, false, 234.0f, 116.09f)
                close()
                moveTo(58.61f, 70.86f)
                lineToRelative(10.76f, 29.28f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 80.64f, 108.0f)
                horizontalLineToRelative(94.72f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.27f, -7.86f)
                lineToRelative(10.76f, -29.28f)
                lineToRelative(9.14f, 35.0f)
                lineTo(128.0f, 161.31f)
                lineTo(49.47f, 105.83f)
                close()
                moveTo(44.0f, 131.37f)
                lineTo(107.2f, 176.0f)
                lineToRelative(-13.79f, 9.74f)
                lineToRelative(-34.0f, -24.0f)
                arcTo(36.86f, 36.86f, 0.0f, false, true, 44.0f, 131.37f)
                close()
                moveTo(128.0f, 210.19f)
                lineTo(114.21f, 200.44f)
                lineTo(128.0f, 190.7f)
                lineToRelative(13.79f, 9.74f)
                close()
                moveTo(196.6f, 161.72f)
                lineTo(162.6f, 185.72f)
                lineTo(148.8f, 176.0f)
                lineTo(212.0f, 131.37f)
                arcTo(36.86f, 36.86f, 0.0f, false, true, 196.6f, 161.72f)
                close()
            }
        }
        .build()
        return `_gitlab-logo-bold`!!
    }

private var `_gitlab-logo-bold`: ImageVector? = null
