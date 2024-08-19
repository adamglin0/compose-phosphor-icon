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

public val RegularGroup.`Share-fat`: ImageVector
    get() {
        if (`_share-fat` != null) {
            return `_share-fat`!!
        }
        `_share-fat` = Builder(name = "Share-fat", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.66f, 106.35f)
                lineToRelative(-80.0f, -80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 32.0f)
                verticalLineTo(72.35f)
                curveToRelative(-25.94f, 2.22f, -54.59f, 14.92f, -78.16f, 34.91f)
                curveToRelative(-28.38f, 24.08f, -46.05f, 55.11f, -49.76f, 87.37f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.68f, 9.58f)
                horizontalLineToRelative(0.0f)
                curveToRelative(11.0f, -11.71f, 50.14f, -48.74f, 107.24f, -52.0f)
                verticalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.65f)
                lineToRelative(80.0f, -80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 237.66f, 106.35f)
                close()
                moveTo(160.0f, 172.69f)
                verticalLineTo(144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                curveToRelative(-28.08f, 0.0f, -55.43f, 7.33f, -81.29f, 21.8f)
                arcToRelative(196.17f, 196.17f, 0.0f, false, false, -36.57f, 26.52f)
                curveToRelative(5.8f, -23.84f, 20.42f, -46.51f, 42.05f, -64.86f)
                curveTo(99.41f, 99.77f, 127.75f, 88.0f, 152.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(51.32f)
                lineTo(220.69f, 112.0f)
                close()
            }
        }
        .build()
        return `_share-fat`!!
    }

private var `_share-fat`: ImageVector? = null
