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

public val ThinGroup.Fireextinguisher: ImageVector
    get() {
        if (_fireextinguisher != null) {
            return _fireextinguisher!!
        }
        _fireextinguisher = Builder(name = "Fireextinguisher", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(217.15f, 52.17f)
                lineToRelative(-70.34f, -21.1f)
                lineToRelative(39.0f, -19.49f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.58f, -7.16f)
                lineTo(135.0f, 28.0f)
                arcToRelative(76.07f, 76.07f, 0.0f, false, false, -75.0f, 76.0f)
                lineTo(60.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(68.0f, 172.0f)
                lineTo(92.0f, 172.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(180.0f, 104.0f)
                arcToRelative(44.06f, 44.06f, 0.0f, false, false, -40.0f, -43.81f)
                lineTo(140.0f, 37.38f)
                lineToRelative(74.85f, 22.45f)
                arcTo(3.82f, 3.82f, 0.0f, false, false, 216.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.15f, -7.83f)
                close()
                moveTo(68.0f, 164.0f)
                lineTo(68.0f, 104.0f)
                arcToRelative(68.08f, 68.08f, 0.0f, false, true, 64.0f, -67.87f)
                lineTo(132.0f, 60.19f)
                arcTo(44.06f, 44.06f, 0.0f, false, false, 92.0f, 104.0f)
                verticalLineToRelative(60.0f)
                close()
                moveTo(168.0f, 236.0f)
                lineTo(104.0f, 236.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(100.0f, 172.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(60.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 168.0f, 236.0f)
                close()
                moveTo(172.0f, 104.0f)
                verticalLineToRelative(60.0f)
                lineTo(100.0f, 164.0f)
                lineTo(100.0f, 104.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 72.0f, 0.0f)
                close()
            }
        }
        .build()
        return _fireextinguisher!!
    }

private var _fireextinguisher: ImageVector? = null
