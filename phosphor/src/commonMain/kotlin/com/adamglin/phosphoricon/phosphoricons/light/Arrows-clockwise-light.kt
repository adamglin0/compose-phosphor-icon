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

public val LightGroup.`Arrows-clockwise-light`: ImageVector
    get() {
        if (`_arrows-clockwise-light` != null) {
            return `_arrows-clockwise-light`!!
        }
        `_arrows-clockwise-light` = Builder(name = "Arrows-clockwise-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 48.0f)
                verticalLineTo(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(33.52f)
                lineTo(183.47f, 72.0f)
                arcToRelative(81.51f, 81.51f, 0.0f, false, false, -57.53f, -24.0f)
                horizontalLineToRelative(-0.46f)
                arcTo(81.5f, 81.5f, 0.0f, false, false, 68.19f, 71.28f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.38f, -8.58f)
                arcToRelative(93.38f, 93.38f, 0.0f, false, true, 65.67f, -26.76f)
                horizontalLineTo(126.0f)
                arcToRelative(93.45f, 93.45f, 0.0f, false, true, 66.0f, 27.53f)
                lineToRelative(18.0f, 18.0f)
                verticalLineTo(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(187.81f, 184.72f)
                arcToRelative(81.5f, 81.5f, 0.0f, false, true, -57.29f, 23.34f)
                horizontalLineToRelative(-0.46f)
                arcToRelative(81.51f, 81.51f, 0.0f, false, true, -57.53f, -24.0f)
                lineTo(54.48f, 166.0f)
                horizontalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(174.48f)
                lineToRelative(18.0f, 18.05f)
                arcToRelative(93.45f, 93.45f, 0.0f, false, false, 66.0f, 27.53f)
                horizontalLineToRelative(0.52f)
                arcToRelative(93.38f, 93.38f, 0.0f, false, false, 65.67f, -26.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.38f, -8.58f)
                close()
            }
        }
        .build()
        return `_arrows-clockwise-light`!!
    }

private var `_arrows-clockwise-light`: ImageVector? = null
