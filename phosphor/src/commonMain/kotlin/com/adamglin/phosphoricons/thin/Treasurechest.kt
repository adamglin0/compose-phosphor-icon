package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Treasurechest: ImageVector
    get() {
        if (_treasurechest != null) {
            return _treasurechest!!
        }
        _treasurechest = Builder(name = "Treasurechest", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 44.0f)
                lineTo(72.0f, 44.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, false, 20.0f, 96.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(224.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 96.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, false, 184.0f, 44.0f)
                close()
                moveTo(228.0f, 96.0f)
                verticalLineToRelative(12.0f)
                lineTo(188.0f, 108.0f)
                lineTo(188.0f, 52.19f)
                arcTo(44.06f, 44.06f, 0.0f, false, true, 228.0f, 96.0f)
                close()
                moveTo(140.0f, 140.0f)
                lineTo(116.0f, 140.0f)
                lineTo(116.0f, 100.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(112.0f, 148.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(148.0f, 116.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(80.0f)
                lineTo(76.0f, 196.0f)
                lineTo(76.0f, 116.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(28.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 112.0f, 148.0f)
                close()
                moveTo(148.0f, 108.0f)
                lineTo(148.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(112.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(12.0f)
                lineTo(76.0f, 108.0f)
                lineTo(76.0f, 52.0f)
                lineTo(180.0f, 52.0f)
                verticalLineToRelative(56.0f)
                close()
                moveTo(68.0f, 52.19f)
                lineTo(68.0f, 108.0f)
                lineTo(28.0f, 108.0f)
                lineTo(28.0f, 96.0f)
                arcTo(44.06f, 44.06f, 0.0f, false, true, 68.0f, 52.19f)
                close()
                moveTo(28.0f, 192.0f)
                lineTo(28.0f, 116.0f)
                lineTo(68.0f, 116.0f)
                verticalLineToRelative(80.0f)
                lineTo(32.0f, 196.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 192.0f)
                close()
                moveTo(224.0f, 196.0f)
                lineTo(188.0f, 196.0f)
                lineTo(188.0f, 116.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(76.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 224.0f, 196.0f)
                close()
            }
        }
        .build()
        return _treasurechest!!
    }

private var _treasurechest: ImageVector? = null
