package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.TreasureChest: ImageVector
    get() {
        if (_treasureChest != null) {
            return _treasureChest!!
        }
        _treasureChest = Builder(name = "TreasureChest", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 36.0f)
                lineTo(72.0f, 36.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 12.0f, 96.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(224.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(244.0f, 96.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 184.0f, 36.0f)
                close()
                moveTo(220.0f, 96.0f)
                verticalLineToRelative(4.0f)
                lineTo(192.0f, 100.0f)
                lineTo(192.0f, 60.91f)
                arcTo(36.05f, 36.05f, 0.0f, false, true, 220.0f, 96.0f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(140.0f, 124.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(64.0f)
                lineTo(88.0f, 188.0f)
                lineTo(88.0f, 124.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 156.0f)
                close()
                moveTo(140.0f, 100.0f)
                lineTo(140.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                lineTo(88.0f, 100.0f)
                lineTo(88.0f, 60.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(64.0f, 60.91f)
                lineTo(64.0f, 100.0f)
                lineTo(36.0f, 100.0f)
                lineTo(36.0f, 96.0f)
                arcTo(36.05f, 36.05f, 0.0f, false, true, 64.0f, 60.91f)
                close()
                moveTo(36.0f, 124.0f)
                lineTo(64.0f, 124.0f)
                verticalLineToRelative(64.0f)
                lineTo(36.0f, 188.0f)
                close()
                moveTo(192.0f, 188.0f)
                lineTo(192.0f, 124.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(64.0f)
                close()
            }
        }
        .build()
        return _treasureChest!!
    }

private var _treasureChest: ImageVector? = null
