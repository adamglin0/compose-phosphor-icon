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

public val FillGroup.`Hash-fill`: ImageVector
    get() {
        if (`_hash-fill` != null) {
            return `_hash-fill`!!
        }
        `_hash-fill` = Builder(name = "Hash-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.25f, 112.0f)
                horizontalLineToRelative(31.5f)
                lineToRelative(-8.0f, 32.0f)
                horizontalLineToRelative(-31.5f)
                close()
                moveTo(224.0f, 48.0f)
                lineTo(224.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f)
                lineTo(208.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f)
                close()
                moveTo(208.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(168.25f, 96.0f)
                lineToRelative(7.51f, -30.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.52f, -3.88f)
                lineTo(151.75f, 96.0f)
                horizontalLineToRelative(-31.5f)
                lineToRelative(7.51f, -30.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.52f, -3.88f)
                lineTo(103.75f, 96.0f)
                lineTo(64.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(99.75f, 112.0f)
                lineToRelative(-8.0f, 32.0f)
                lineTo(56.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(87.75f, 160.0f)
                lineToRelative(-7.51f, 30.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.82f, 9.7f)
                arcToRelative(8.13f, 8.13f, 0.0f, false, false, 2.0f, 0.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.75f, -6.06f)
                lineTo(104.25f, 160.0f)
                horizontalLineToRelative(31.5f)
                lineToRelative(-7.51f, 30.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.82f, 9.7f)
                arcTo(8.13f, 8.13f, 0.0f, false, false, 136.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.75f, -6.06f)
                lineTo(152.25f, 160.0f)
                lineTo(192.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(156.25f, 144.0f)
                lineToRelative(8.0f, -32.0f)
                lineTo(200.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 104.0f)
                close()
            }
        }
        .build()
        return `_hash-fill`!!
    }

private var `_hash-fill`: ImageVector? = null
