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

public val ThinGroup.Babycarriage: ImageVector
    get() {
        if (_babycarriage != null) {
            return _babycarriage!!
        }
        _babycarriage = Builder(name = "Babycarriage", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 36.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(60.0f)
                lineTo(51.77f, 108.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 16.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, false, 76.0f, 76.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 0.0f, -152.0f)
                close()
                moveTo(227.87f, 108.0f)
                lineTo(155.4f, 108.0f)
                lineToRelative(53.71f, -43.0f)
                arcTo(67.76f, 67.76f, 0.0f, false, true, 227.87f, 108.0f)
                close()
                moveTo(152.0f, 44.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(67.72f, 67.72f, 0.0f, false, true, 43.2f, 15.52f)
                lineTo(148.0f, 103.68f)
                lineTo(148.0f, 48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 152.0f, 44.0f)
                close()
                moveTo(160.0f, 180.0f)
                lineTo(120.0f, 180.0f)
                arcToRelative(68.08f, 68.08f, 0.0f, false, true, -67.88f, -64.0f)
                lineTo(227.88f, 116.0f)
                arcTo(68.08f, 68.08f, 0.0f, false, true, 160.0f, 180.0f)
                close()
                moveTo(100.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 224.0f)
                close()
                moveTo(204.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 204.0f, 224.0f)
                close()
            }
        }
        .build()
        return _babycarriage!!
    }

private var _babycarriage: ImageVector? = null
