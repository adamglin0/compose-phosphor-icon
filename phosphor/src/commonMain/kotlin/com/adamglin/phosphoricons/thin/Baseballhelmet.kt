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

public val ThinGroup.Baseballhelmet: ImageVector
    get() {
        if (_baseballhelmet != null) {
            return _baseballhelmet!!
        }
        _baseballhelmet = Builder(name = "Baseballhelmet", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 132.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 88.0f, 132.0f)
                close()
                moveTo(88.0f, 172.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 88.0f, 172.0f)
                close()
                moveTo(248.0f, 124.0f)
                lineTo(219.92f, 124.0f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 20.0f, 128.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, false, 68.0f, 68.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, false, 68.0f, -68.0f)
                lineTo(196.0f, 132.0f)
                horizontalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(188.0f, 152.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, true, -60.0f, 60.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, false, 36.0f, -60.0f)
                lineTo(156.0f, 132.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(152.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -120.0f, 0.0f)
                lineTo(28.0f, 128.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 183.91f, -4.0f)
                close()
            }
        }
        .build()
        return _baseballhelmet!!
    }

private var _baseballhelmet: ImageVector? = null
