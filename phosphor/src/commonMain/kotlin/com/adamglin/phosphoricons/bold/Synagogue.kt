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

public val BoldGroup.Synagogue: ImageVector
    get() {
        if (_synagogue != null) {
            return _synagogue!!
        }
        _synagogue = Builder(name = "Synagogue", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 54.34f)
                lineTo(208.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(184.0f, 54.34f)
                arcTo(32.06f, 32.06f, 0.0f, false, false, 164.0f, 84.0f)
                verticalLineToRelative(26.75f)
                lineTo(140.0f, 97.0f)
                lineTo(140.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(116.0f, 97.0f)
                lineTo(92.0f, 110.75f)
                lineTo(92.0f, 84.0f)
                arcTo(32.06f, 32.06f, 0.0f, false, false, 72.0f, 54.34f)
                lineTo(72.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(48.0f, 54.34f)
                arcTo(32.06f, 32.06f, 0.0f, false, false, 28.0f, 84.0f)
                lineTo(28.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(216.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 84.0f)
                arcTo(32.06f, 32.06f, 0.0f, false, false, 208.0f, 54.34f)
                close()
                moveTo(128.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(32.0f)
                lineTo(92.0f, 204.0f)
                lineTo(92.0f, 138.39f)
                lineToRelative(36.0f, -20.57f)
                lineToRelative(36.0f, 20.57f)
                lineTo(164.0f, 204.0f)
                lineTo(140.0f, 204.0f)
                lineTo(140.0f, 172.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 160.0f)
                close()
                moveTo(52.0f, 84.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(16.0f)
                lineTo(52.0f, 100.0f)
                close()
                moveTo(188.0f, 84.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(16.0f)
                lineTo(188.0f, 100.0f)
                close()
                moveTo(52.0f, 124.0f)
                lineTo(68.0f, 124.0f)
                verticalLineToRelative(80.0f)
                lineTo(52.0f, 204.0f)
                close()
                moveTo(188.0f, 204.0f)
                lineTo(188.0f, 124.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(80.0f)
                close()
            }
        }
        .build()
        return _synagogue!!
    }

private var _synagogue: ImageVector? = null
