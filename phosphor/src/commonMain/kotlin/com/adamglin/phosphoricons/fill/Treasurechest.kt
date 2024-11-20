package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.TreasureChest: ImageVector
    get() {
        if (_treasureChest != null) {
            return _treasureChest!!
        }
        _treasureChest = Builder(name = "TreasureChest", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 124.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineTo(56.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, 8.0f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 72.0f, 183.73f)
                verticalLineTo(120.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(120.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, 8.0f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, 7.47f, -8.25f)
                verticalLineTo(120.0f)
                horizontalLineToRelative(36.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 240.0f, 124.0f)
                close()
                moveTo(184.0f, 40.0f)
                horizontalLineTo(72.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 16.0f, 96.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineTo(56.0f)
                verticalLineTo(64.27f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 63.47f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 64.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(40.0f)
                verticalLineTo(92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(40.0f)
                verticalLineTo(64.27f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 191.47f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 64.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(96.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 184.0f, 40.0f)
                close()
            }
        }
        .build()
        return _treasureChest!!
    }

private var _treasureChest: ImageVector? = null
