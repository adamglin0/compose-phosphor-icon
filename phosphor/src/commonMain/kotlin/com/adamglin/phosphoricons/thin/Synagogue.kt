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

public val ThinGroup.Synagogue: ImageVector
    get() {
        if (_synagogue != null) {
            return _synagogue!!
        }
        _synagogue = Builder(name = "Synagogue", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 60.4f)
                lineTo(204.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(196.0f, 60.4f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 180.0f, 80.0f)
                verticalLineToRelative(49.11f)
                lineToRelative(-48.0f, -27.43f)
                lineTo(132.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(29.68f)
                lineTo(76.0f, 129.11f)
                lineTo(76.0f, 80.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 60.0f, 60.4f)
                lineTo(60.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(52.0f, 60.4f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 80.0f)
                lineTo(36.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(116.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(220.0f, 80.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 204.0f, 60.4f)
                close()
                moveTo(200.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(28.0f)
                lineTo(188.0f, 108.0f)
                lineTo(188.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 68.0f)
                close()
                moveTo(56.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 68.0f, 80.0f)
                verticalLineToRelative(28.0f)
                lineTo(44.0f, 108.0f)
                lineTo(44.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 68.0f)
                close()
                moveTo(44.0f, 116.0f)
                lineTo(68.0f, 116.0f)
                verticalLineToRelative(96.0f)
                lineTo(44.0f, 212.0f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(36.0f)
                lineTo(76.0f, 212.0f)
                lineTo(76.0f, 138.32f)
                lineToRelative(52.0f, -29.71f)
                lineToRelative(52.0f, 29.71f)
                lineTo(180.0f, 212.0f)
                lineTo(148.0f, 212.0f)
                lineTo(148.0f, 176.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 128.0f, 156.0f)
                close()
                moveTo(188.0f, 212.0f)
                lineTo(188.0f, 116.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(96.0f)
                close()
            }
        }
        .build()
        return _synagogue!!
    }

private var _synagogue: ImageVector? = null
