package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Court-basketball-fill`: ImageVector
    get() {
        if (`_court-basketball-fill` != null) {
            return `_court-basketball-fill`!!
        }
        `_court-basketball-fill` = Builder(name = "Court-basketball-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 92.23f)
                verticalLineToRelative(71.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.41f, 4.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, -79.52f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 240.0f, 92.23f)
                close()
                moveTo(20.41f, 167.76f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, -79.52f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.41f, 4.0f)
                verticalLineToRelative(71.54f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 20.41f, 167.76f)
                close()
                moveTo(116.0f, 48.0f)
                lineTo(32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 64.0f)
                verticalLineToRelative(4.13f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.8f, 4.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 0.0f, 111.74f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.8f, 4.0f)
                lineTo(16.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(120.0f, 52.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 116.0f, 48.0f)
                close()
                moveTo(224.0f, 48.0f)
                lineTo(140.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(136.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-4.13f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.8f, -4.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 0.0f, -111.74f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.8f, -4.0f)
                lineTo(240.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 48.0f)
                close()
            }
        }
        .build()
        return `_court-basketball-fill`!!
    }

private var `_court-basketball-fill`: ImageVector? = null
