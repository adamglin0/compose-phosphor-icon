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

public val RegularGroup.`Boxing-glove`: ImageVector
    get() {
        if (`_boxing-glove` != null) {
            return `_boxing-glove`!!
        }
        `_boxing-glove` = Builder(name = "Boxing-glove", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 16.0f)
                lineTo(120.0f, 16.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 64.0f, 72.0f)
                lineTo(56.0f, 72.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                verticalLineToRelative(29.19f)
                arcToRelative(16.09f, 16.09f, 0.0f, false, false, 3.51f, 10.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.62f, 0.69f)
                lineTo(64.0f, 179.34f)
                lineTo(64.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(192.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(208.0f, 177.12f)
                lineToRelative(15.38f, -53.85f)
                arcToRelative(15.89f, 15.89f, 0.0f, false, false, 0.62f, -4.39f)
                lineTo(224.0f, 72.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 168.0f, 16.0f)
                close()
                moveTo(208.0f, 118.88f)
                lineTo(192.31f, 173.8f)
                arcTo(7.85f, 7.85f, 0.0f, false, false, 192.0f, 176.0f)
                verticalLineToRelative(40.0f)
                lineTo(80.0f, 216.0f)
                lineTo(80.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.38f, -5.69f)
                lineTo(40.0f, 133.12f)
                lineTo(40.0f, 104.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 88.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(80.0f, 72.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, -40.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, 40.0f)
                close()
                moveTo(171.58f, 167.16f)
                lineTo(153.89f, 176.0f)
                lineToRelative(17.69f, 8.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.16f, 14.32f)
                lineTo(136.0f, 184.94f)
                lineToRelative(-28.42f, 14.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -7.16f, -14.32f)
                lineTo(118.11f, 176.0f)
                lineToRelative(-17.69f, -8.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 7.16f, -14.32f)
                lineTo(136.0f, 167.06f)
                lineToRelative(28.42f, -14.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 7.16f, 14.32f)
                close()
            }
        }
        .build()
        return `_boxing-glove`!!
    }

private var `_boxing-glove`: ImageVector? = null
