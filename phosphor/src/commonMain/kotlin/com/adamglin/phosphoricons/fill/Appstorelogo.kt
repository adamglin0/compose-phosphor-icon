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

public val FillGroup.Appstorelogo: ImageVector
    get() {
        if (_appstorelogo != null) {
            return _appstorelogo!!
        }
        _appstorelogo = Builder(name = "Appstorelogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(83.66f, 180.12f)
                lineToRelative(-4.8f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.72f, -8.24f)
                lineToRelative(4.8f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.72f, 8.24f)
                close()
                moveTo(128.0f, 152.0f)
                lineTo(56.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(91.47f, 136.0f)
                lineToRelative(27.2f, -45.33f)
                lineTo(105.14f, 68.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.72f, -8.24f)
                lineTo(128.0f, 75.12f)
                lineToRelative(9.14f, -15.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.72f, 8.24f)
                lineTo(110.13f, 136.0f)
                lineTo(128.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(200.0f, 152.0f)
                lineTo(174.13f, 152.0f)
                lineToRelative(16.73f, 27.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.72f, 8.24f)
                lineToRelative(-38.4f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.72f, -8.24f)
                lineTo(164.53f, 136.0f)
                lineTo(200.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return _appstorelogo!!
    }

private var _appstorelogo: ImageVector? = null
